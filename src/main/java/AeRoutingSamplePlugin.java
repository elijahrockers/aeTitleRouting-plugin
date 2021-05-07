/*
 * xnat-template: org.nrg.xnat.plugins.template.plugin.AeRoutingSamplePlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2021, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.plugins.template.plugin;

import org.nrg.dcm.id.ClassicDicomObjectIdentifier;
import org.nrg.dcm.id.CompositeDicomObjectIdentifier;
import org.nrg.dcm.id.FixedDicomProjectIdentifier;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.security.user.XnatUserProvider;

import org.springframework.context.annotation.Bean;

@XnatPlugin(value = "aeRoutingSample", name = "XNAT 1.8 AE Routing Sample Plugin")
public class AeRoutingSamplePlugin {

    @Bean
    public CompositeDicomObjectIdentifier dicomObjectIdentifierA(final XnatUserProvider receivedFileUserProvider) {
        return constructIdentifier("A", receivedFileUserProvider);
    }

    @Bean
    public CompositeDicomObjectIdentifier dicomObjectIdentifierB(final XnatUserProvider receivedFileUserProvider) {
        return constructIdentifier("B", receivedFileUserProvider);
    }

    private CompositeDicomObjectIdentifier constructIdentifier(String projectId, XnatUserProvider receivedFileUserProvider) {
        final CompositeDicomObjectIdentifier identifier = new CompositeDicomObjectIdentifier(
                new FixedDicomProjectIdentifier(projectId),
                ClassicDicomObjectIdentifier.getSubjectExtractors(),
                ClassicDicomObjectIdentifier.getSessionExtractors(),
                ClassicDicomObjectIdentifier.getAAExtractors()
        );
        identifier.setUserProvider(receivedFileUserProvider);
        return identifier;
    }

}
