/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hz
 */
public class Conta {
    private int id_conta;
    private float saldo;

    public Conta() {
        this.id_conta = 0;
        this.saldo = 0;
    }
    public Conta(int id_conta, float saldo) {
        this.id_conta = id_conta;
        this.saldo = saldo;
    }

    public int getId_conta() {
        return id_conta;
    }
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
 
    public void printConta(){    
        System.out.printf("Numero da Conta: %d, Saldo: %f\n", this.getId_conta(), this.getSaldo());
    }
}
