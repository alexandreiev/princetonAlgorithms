package com.alex.andreiev.bouncingBalls;

public class Main {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Ball[] balls = new Ball[N];
        for (int i = 0; i < N; i++)
            balls[i] = new Ball();
        while (true){
            StdDraw.clear();
            for (int i = 0; i < N; i++){
                balls[i].move(0.5);
                balls[i].draw();
            }
            StrDraw.show(50);
        }
    }
}
