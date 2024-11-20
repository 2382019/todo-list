module TodoApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires java.xml.crypto;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.config;
    opens todoapp.views;
}