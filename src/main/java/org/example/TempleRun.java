package org.example;

public class TempleRun implements Game {
    @Override
    public void up() { System.out.println("Temple Run jumps"); }
    @Override
    public void down() { System.out.println("Temple Run slides"); }
    @Override
    public void left() { System.out.println("Temple Run turns left"); }
    @Override
    public void right() { System.out.println("Temple Run turns right"); }
}
