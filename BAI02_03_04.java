/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI02;

class Game {

    String desciption;

    Game(String desciption) {
        this.desciption = desciption;
    }
}

class GamePC extends Game {

    int Ram;
    int Megabyte;
    int Ghz;

    GamePC(int Ram, int Megabyte, int Ghz, String desciption) {
        super(desciption);
        this.Ram = Ram;
        this.Megabyte = Megabyte;
        this.Ghz = Ghz;
    }

    void out() {
        System.out.println("* Info Game PC : " + desciption
                + "\n- Ram needed to play the game: " + Ram
                + "\n- Megabyte needed to install the game: " + Megabyte
                + "\n- GHz performance of the CPU: " + Ghz);
    }
}

class Client extends GamePC {

    Client(int Ram, int Megabyte, int Ghz, String desciption) {
        super(Ram, Megabyte, Ghz, desciption);
    }

    void out() {
        System.out.println("\n* Info Game PC of client : " + desciption
                + "\n- Ram needed to play the game: " + Ram
                + "\n- Megabyte needed to install the game: " + Megabyte
                + "\n- GHz performance of the CPU: " + Ghz);
    }
}

class GameDoVui extends GamePC {

    int prize;
    int numberquestion;

    GameDoVui(int prize, int numberquestion, int Ram, int Megabyte, int Ghz, String desciption) {
        super(Ram, Megabyte, Ghz, desciption);
        this.prize = prize;
        this.numberquestion = numberquestion;
    }

    void out() {
        System.out.println("\n* Info Game: " + desciption
                + "\n- Ram needed to play the game: " + Ram
                + "\n- Megabyte needed to install the game: " + Megabyte
                + "\n- GHz performance of the CPU: " + Ghz
                + "\n=>[ Money prize : " + prize + " ]" + " \n=>[ Number question that must be answered to win the ultimate money: " + numberquestion + " ]");
    }
}

class Client2 {

    int questiontrue;

    Client2(int questiontrue) {
        this.questiontrue = questiontrue;
    }

    void out() {
        System.out.println("- Number question client answered correctly : " + questiontrue);
    }

    void check(GameDoVui x) {
        if (questiontrue == x.numberquestion) {
            System.out.println("- Client WIN => Money prize : 9000");
        } else {
            System.out.println("- Client LOSE => Money prize : " + (9000 / 3) * questiontrue);
        }
    }

}

class BoardGame extends GamePC {

    int minimumplayer;
    int maximumplayer;
    int time;

    BoardGame(int minimumplayer, int maximumplayer, int time, int Ram, int Megabyte, int Ghz, String desciption) {
        super(Ram, Megabyte, Ghz, desciption);
        this.minimumplayer = minimumplayer;
        this.maximumplayer = maximumplayer;
        this.time = time;
    }

    void out() {
        System.out.println("\n* Info Game: " + desciption
                + "\n- Ram needed to play the game: " + Ram
                + "\n- Megabyte needed to install the game: " + Megabyte
                + "\n- GHz performance of the CPU: " + Ghz
                + "\n- Minimum player : " + minimumplayer
                + "\n- Maximum player : " + maximumplayer
                + "\n- Time limit to end game :" + time);
    }
}

public class BAI02_03_04 {

    public static void main(String[] args) {
        System.out.println("----------------EX 2----------------");
        GamePC p = new GamePC(8, 256, 888, "Game Ai la trieu phu");
        p.out();
        Client p1 = new Client(8, 256, 888, "Game Ai la trieu phu");
        p1.out();
        System.out.print("=====> Check PC client :");
        if (p.Ghz == p1.Ghz && p.Megabyte == p1.Megabyte && p.Ram == p1.Ram) {
            System.out.println("[ Qualifide for installation ]");
        } else {
            System.out.println("[ No for installation ]");
        }
        System.out.println("\n----------------EX 3----------------");
        GameDoVui f = new GameDoVui(9000, 3, 8, 256, 888, "Game Ai la trieu phu");
        f.out();
        Client2 f2 = new Client2(2);
        f2.out();
        f2.check(f);
        System.out.println("\n----------------EX 4----------------");
        BoardGame f3 = new BoardGame(2, 4, 60, 4, 20, 123, "Danh Co Tuong");
        f3.out();
        Client p2 = new Client(8, 256, 888, "Danh Co Tuong");
        p2.out();
        System.out.print("=====> Check PC client :");
        if (f3.Ghz == p2.Ghz && f3.Megabyte == p2.Megabyte && f3.Ram == p2.Ram) {
            System.out.println("[ Qualifide for installation ]");
        } else {
            System.out.println("[ No for installation ]");
        }

    }
}
