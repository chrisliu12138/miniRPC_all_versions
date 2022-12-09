package com.example.rpc.Server;

import com.example.rpc.Service.blogServiceImp;
import com.example.rpc.Service.userServiceImp;
import com.example.rpc.Utils.ServiceProvider;


public class Server {

    private final static int PORT = 8008;

    public static void main(String[] args) {
        blogServiceImp blogServiceImp = new blogServiceImp();
        userServiceImp userServiceImp = new userServiceImp();


        SimpleRPCserver rpCserver = new SimpleRPCserver();
        rpCserver.start(PORT);

    }
}
