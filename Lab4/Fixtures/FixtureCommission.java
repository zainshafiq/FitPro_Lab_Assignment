import fit.ColumnFixture;

public class FixtureCommission extends ColumnFixture {
	
	public int locks, stocks, barrels;
	
	public double tstCalculateSales() {
		//return 100.00;
		return 10.00;
	}
	
	public double tstCalculateCommission() {
		return 10.00;
	}      
    
}
