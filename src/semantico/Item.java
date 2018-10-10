package semantico;

import parser.Token;

public abstract class Item {

    Token token;

    public Item(Token token) {
        this.token = token;
    }

    public String getLexema() {
        return null;
    }

    @Override
    public abstract String toString();
}
