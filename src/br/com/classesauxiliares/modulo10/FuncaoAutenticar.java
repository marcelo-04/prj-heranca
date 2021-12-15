package br.com.classesauxiliares.modulo10;

import br.com.interfaces.modulo10.PermitirAcesso;

public class FuncaoAutenticar {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar() {
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticar(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }
}
