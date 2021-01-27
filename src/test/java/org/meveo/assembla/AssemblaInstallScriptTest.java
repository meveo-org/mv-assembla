package org.meveo.assembla;

import java.io.InputStream;

import org.junit.Test;
import org.meveo.api.exception.BusinessApiException;

public class AssemblaInstallScriptTest {
    @Test
    public void getArtifact() {
        AssemblaInstallScript script = new AssemblaInstallScript();
        try {
            script.updloadArtifact();
        } catch (BusinessApiException e) {
            e.printStackTrace();
        }
    }
}
