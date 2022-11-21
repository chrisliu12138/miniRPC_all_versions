package com.example.rpc.Client;


import com.example.rpc.Service.UserService;
import com.example.rpc.entity.User;

public class Client {

    public static void main(String[] args) {

        ClientProxy clientProxy = new ClientProxy();
        UserService proxy = clientProxy.getProxy(UserService.class);

        User userById = proxy.getUserById(1);
        System.out.println(userById);

        int i = proxy.insertUser(new User());
        System.out.println(i);

    }
}
