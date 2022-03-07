package com.example.modernjava.binding;

abstract class Shape {
        private int x;
        private int y;

        Shape(int newx, int newy) {
            moveTo(newx, newy);
        }

        int getX() { return x; }
        int getY() { return y; }
        void setX(int newx) { x = newx; }
        void setY(int newy) { y = newy; }

        void moveTo(int newx, int newy) {
            setX(newx);
            setY(newy);
        }
        void rMoveTo(int deltax, int deltay) {
            moveTo(getX() + deltax, getY() + deltay);
        }
        abstract void draw();
}
