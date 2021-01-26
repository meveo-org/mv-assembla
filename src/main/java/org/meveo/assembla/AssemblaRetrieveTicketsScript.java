package org.meveo.assembla;

import java.util.Map;

import com.assembla.Ticket;
import com.assembla.client.AssemblaAPI;
import com.assembla.client.AssemblaResource;

import org.meveo.service.script.Script;

public class AssemblaRetrieveTicketsScript extends Script{

    private String key;
    private String secret;
    private String space;

    public void setKey(String key){
        this.key=key;
    }

    public void setSecret(String secret){
        this.secret=secret;
    }

    public void setSpace(String space){
        this.space=space;
    }

    @Override
    public void execute(Map<String,Object> params) {
        AssemblaResource api  = AssemblaAPI.create(key, secret);
        Ticket ticket100  = api.tickets(space).getByNumber(100);
        System.out.println(ticket100);
    }

}