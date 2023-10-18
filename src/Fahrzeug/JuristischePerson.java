package Fahrzeug;

public abstract class JuristischePerson
{
    protected String name;

    public JuristischePerson(String name)
    {
        this.name = name;
    }

    @Override
    public abstract String toString();

}
