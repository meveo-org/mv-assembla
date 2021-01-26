package org.meveo.assembla;

import java.util.HashMap;

import org.junit.Test;

/*
this assumes you created in this package a class with your app id and secret
this class is refered in .gitignore so should not get commited

package org.meveo.assembla;

public class AssemblaParams {
    public static final String key = "myAssemblaAppId";
    public static final String secret="myAssemblaAppSecret";
}

*/

public class AssemblaRetrieveTicketsScriptTest {

    @Test
    public void getTicket(){
     AssemblaRetrieveTicketsScript script = new AssemblaRetrieveTicketsScript();
     script.setKey(AssemblaParams.key);
     script.setSecret(AssemblaParams.secret);
     script.setSpace("finprotect");
     script.execute(new HashMap<>());
    }

}