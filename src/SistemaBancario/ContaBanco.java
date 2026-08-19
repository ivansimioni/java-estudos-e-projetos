package SistemaBancario;


public class ContaBanco {
    public int numConta;
    protected char tipo;
    private String dono;
    private double saldo;
    private boolean status;


    public ContaBanco(int n, char t, String d) {
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
        status = false;
        saldo = 0;
    }

    public void status() {
        System.out.println("Titular: " + dono);
        System.out.println("Número da conta: " + numConta);
        if (tipo == 'C') {
            System.out.println("Tipo conta: CORRENTE");
        } else if (tipo == 'P') {
            System.out.println("Tipo conta: POUPANÇA");
        }
        System.out.println("Saldo: " + saldo + "R$");
        System.out.println("Conta aberta? " + status);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }


    public void abrirConta() {
        status = true;
        if (tipo == 'P') {
            saldo = saldo + 150;
        } else if (tipo == 'C') {
            saldo = saldo + 50;
        }
    }

    public void fecharConta() {
        if (saldo == 0) {
            System.out.print("CONTA FECHADA.");
            status = false;
        } else if (saldo > 0) {
            System.out.print("Há um saldo de: " + saldo + "R$ na conta, saque antes de fechar.");
        } else {
            System.out.print("Há uma dívida de: " + saldo + "R$ na conta, deposite antes de fechar.");
        }
    }

    public void depositar(double deposito) {
        if (status == true && deposito > 0) {
            saldo = saldo + deposito;
        }
    }

    public void sacar(double saque) {
        if (status == false) {
            System.out.println("CONTA FECHADA.");
        }
        else if (status == true && saque <= saldo){
                System.out.println("Saque de " + saque + "R$ realizado com sucesso!");
                saldo = saldo - saque;
                System.out.println("Saldo atual: " + getSaldo());
            } else if (saque <= 0){
            System.out.println("ERRO! O saque deve ser positivo.");
        } else if (saque > saldo) {
            System.out.println("ERRO! Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int num) {
        this.numConta = num;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char t) {
        this.tipo = t;
    }

    public void pagarMensalidade() {
        if (status == true) {
            if (tipo == 'C' && saldo >= 12) {
                saldo = saldo - 12;
            } else if (tipo == 'P' && saldo >= 20) {
                saldo = saldo - 20;
            } else {
                System.out.println("SALDO INSUFICIENTE.");
            }

        }

    }
}

