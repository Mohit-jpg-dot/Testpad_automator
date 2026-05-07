public boolean bankFees(double fees)
{
    double totalFee = fees * (transactions * (transactions + 1) / 2.0);
    if(balance - totalFee > 0.0)
    {
        balance = balance - totalFee;
        return true;
    }
    else
    {
        balance = 0.0;
        return false;
    }
}