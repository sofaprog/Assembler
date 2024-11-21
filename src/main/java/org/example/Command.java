package org.example;

public class Command {
    private String command;
    private String[] args;

    public String toString() {
        return command + " ";
    }

    public Command(String command, String... args) {
        this.command = command;
        this.args = args;
    }

    public String getCommand() {
        return command;
    }

    public String[] getArgs() {
        return args;
    }
}