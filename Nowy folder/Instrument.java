package pl.imiajd.goralski;

import java.time.LocalDate;

public abstract class Instrument {
    public abstract String dzwiek();
    @Override
    public boolean equals(Object Ins)
    {

        return true;
    }
    public String toString()
    {
        return "Instrument wykonal "+producent+" w "+getRokProdukcji()+" roku";
    }
    public String getProducent()
    {
        return producent;
    }
    public int getRokProdukcji()
    {
        return rokProdukcji.getYear();
    }
    private String producent;
    private LocalDate rokProdukcji;
}
