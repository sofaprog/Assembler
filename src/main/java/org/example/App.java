package org.example;

public class App {
    public static void main(String[] args) throws Exception {
        Program program = new Program();
        program.add(new Command("init", "10", "20"));
        program.add(new Command("init", "122", "25"));
        program.add(new Command("init", "66", "5"));
        program.add(new Command("ld", "a", "122"));
        program.add(new Command("ld", "b", "10"));
        program.add(new Command("ld", "c", "66"));
        program.add(new Command("add"));
        program.add(new Command("mv", "a", "d"));
        program.add(new Command("mv", "b", "c"));
        program.add(new Command("div"));
        ICpu cpu = BCpu.create();
        Executer exec = new Executer(cpu);
        exec.run(program);
        System.out.println(program.GetRangeOfMemory());
        program.MostPopularInstruction();
    }
}