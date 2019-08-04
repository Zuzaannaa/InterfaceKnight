package com.kodilla;

interface Quest{
    String process();

}

class DeadIslandQuest implements Quest{
    public String process(){
        return "Dead Island Quest";
    }
}

class EliteKnight implements Quest{
    public String process(){
        return "Elite Knight Quest";
    }

}

class Knight{
    private Quest quest;

    public Knight(Quest quest){
        this.quest = quest;
    }

    public String process(){
        return this.quest.process();
    }
}

class Application{
    public static void main(String[] args){
        Knight knight = new Knight(new EliteKnight());
        String rr = knight.process();
        System.out.println(rr);
    }
}

