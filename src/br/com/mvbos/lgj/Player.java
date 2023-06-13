package br.com.mvbos.lgj;

import java.awt.*;

public class Player implements Comparable <Player> {
    private String nome;
    private int pontos;

    public Player(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString () {
        return getNome() + " " + getPontos();
    }

    @Override
    public int compareTo (Player player) {
        if (this.pontos < player.pontos)
            return 1;

        if (this.pontos > player.pontos)
            return -1;
        return 0;
    }

    public void showRanking(Graphics2D g, int x, int y) {
        g.setColor(new Color(0, 255, 63));
        g.drawString(this.nome + " " + this.pontos, x, y);
    }
}
