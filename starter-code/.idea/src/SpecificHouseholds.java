public class SpecificHouseholds extends Household {
    private int mIncome;

    @Override
    public void getPaid(int income) {
        mIncome = income;
    }

    @Override
    public int payTaxes() {
        return taxes;
    }

    @Override
    public Pet addPet(Pet housePet) {
        return housePet;
    }
}