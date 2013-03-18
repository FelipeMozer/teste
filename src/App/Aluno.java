/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Luiz
 */
public class Aluno {

    protected String nome;
    protected float g1, g2, media;
    protected int ra;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
        this.media = media;

    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float media() {
        if (media >= 7) {
            System.out.println("Aluno Aprovado");

        } else {
            System.out.println("Aluno Reprovado");
        }
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getG1() {
        return g1;
    }

    public void setG1(float g1) {
        this.g1 = g1;
    }

    public float getG2() {
        return g2;
    }

    public void setG2(float g2) {
        this.g2 = g2;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
