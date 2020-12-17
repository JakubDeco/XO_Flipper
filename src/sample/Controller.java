package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
    private int[][] array={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    private List<Button> buttons=new ArrayList<>(16);
    private boolean gameRunning=false;

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btnMix;
    public Label lb_win;

    public void mix(){
        Random random=new Random();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(16)+1;
            switch (x) {
                case 1 -> btn1clicked();
                case 2 -> btn2clicked();
                case 3 -> btn3clicked();
                case 4 -> btn4clicked();
                case 5 -> btn5clicked();
                case 6 -> btn6clicked();
                case 7 -> btn7clicked();
                case 8 -> btn8clicked();
                case 9 -> btn9clicked();
                case 10 -> btn10clicked();
                case 11 -> btn11clicked();
                case 12 -> btn12clicked();
                case 13 -> btn13clicked();
                case 14 -> btn14clicked();
                case 15 -> btn15clicked();
                case 16 -> btn16clicked();
            }
        }
        gameRunning=true;
        lb_win.setVisible(false);
    }

    private void isWinner() {
        if (gameRunning){
            int sum=0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    sum+=array[i][j];
                }
            }
            if (sum==0||sum==16) lb_win.setVisible(true);
        }
        else return;
    }

    public void changeTile(int value, int row, int column){
        if (array[row][column]==0) array[row][column]=1;
        else array[row][column]=0;

        switch (value){
            case 1:if (array[0][0]==0)btn1.setText("O");else btn1.setText("X");break;
            case 2:if (array[0][1]==0)btn2.setText("O");else btn2.setText("X");break;
            case 3:if (array[0][2]==0)btn3.setText("O");else btn3.setText("X");break;
            case 4:if (array[0][3]==0)btn4.setText("O");else btn4.setText("X");break;
            case 5:if (array[1][0]==0)btn5.setText("O");else btn5.setText("X");break;
            case 6:if (array[1][1]==0)btn6.setText("O");else btn6.setText("X");break;
            case 7:if (array[1][2]==0)btn7.setText("O");else btn7.setText("X");break;
            case 8:if (array[1][3]==0)btn8.setText("O");else btn8.setText("X");break;
            case 9:if (array[2][0]==0)btn9.setText("O");else btn9.setText("X");break;
            case 10:if (array[2][1]==0)btn10.setText("O");else btn10.setText("X");break;
            case 11:if (array[2][2]==0)btn11.setText("O");else btn11.setText("X");break;
            case 12:if (array[2][3]==0)btn12.setText("O");else btn12.setText("X");break;
            case 13:if (array[3][0]==0)btn13.setText("O");else btn13.setText("X");break;
            case 14:if (array[3][1]==0)btn14.setText("O");else btn14.setText("X");break;
            case 15:if (array[3][2]==0)btn15.setText("O");else btn15.setText("X");break;
            case 16:if (array[3][3]==0)btn16.setText("O");else btn16.setText("X");break;
        }
    }

    public void btn1clicked() {
        changeTile(2,0,1);
        changeTile(5,1,0);
        changeTile(6,1,1);
        isWinner();
    }

    public void btn2clicked() {
        changeTile(1,0,0);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
        isWinner();
    }

    public void btn3clicked() {
        changeTile(2,0,1);
        changeTile(4,0,3);
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(8,1,3);
        isWinner();
    }

    public void btn4clicked() {
        changeTile(3,0,2);
        changeTile(7,1,2);
        changeTile(8,1,3);
        isWinner();
    }

    public void btn5clicked() {
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(6,1,1);
        changeTile(9,2,0);
        changeTile(10,2,1);
        isWinner();
    }

    public void btn6clicked() {
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(7,1,2);
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(11,2,2);
        isWinner();
    }

    public void btn7clicked() {
        changeTile(2,0,1);
        changeTile(3,0,2);
        changeTile(4,0,3);
        changeTile(6,1,1);
        changeTile(8,1,3);
        changeTile(10,2,1);
        changeTile(11,2,2);
        changeTile(12,2,3);
        isWinner();
    }

    public void btn8clicked() {
        changeTile(3,0,2);
        changeTile(4,0,3);
        changeTile(7,1,2);
        changeTile(11,2,2);
        changeTile(12,2,3);
        isWinner();
    }

    public void btn9clicked() {
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(10,2,1);
        changeTile(13,3,0);
        changeTile(14,3,1);
        isWinner();
    }

    public void btn10clicked() {
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(9,2,0);
        changeTile(11,2,2);
        changeTile(13,3,0);
        changeTile(14,3,1);
        changeTile(15,3,2);
        isWinner();
    }

    public void btn11clicked() {
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(8,1,3);
        changeTile(10,2,1);
        changeTile(12,2,3);
        changeTile(14,3,1);
        changeTile(15,3,2);
        changeTile(16,3,3);
        isWinner();
    }

    public void btn12clicked() {
        changeTile(7,1,2);
        changeTile(8,1,3);
        changeTile(11,2,2);
        changeTile(15,3,2);
        changeTile(16,3,3);
        isWinner();
    }

    public void btn13clicked() {
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(14,3,1);
        isWinner();
    }

    public void btn14clicked() {
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(11,2,2);
        changeTile(13,3,0);
        changeTile(15,3,2);
        isWinner();
    }

    public void btn15clicked() {
        changeTile(10,2,1);
        changeTile(11,2,2);
        changeTile(12,2,3);
        changeTile(14,3,1);
        changeTile(16,3,3);
        isWinner();
    }

    public void btn16clicked() {
        changeTile(11,2,2);
        changeTile(12,2,3);
        changeTile(15,3,2);
        isWinner();
    }
}
