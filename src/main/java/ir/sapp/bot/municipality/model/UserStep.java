package ir.sapp.bot.municipality.model;

public enum UserStep {
    BLOCK_NUMBER(Integer.class);

    UserStep(Class type) {
        this.type = type;
    }

    private Class type;

    public Class getType() {
        return type;
    }
}
