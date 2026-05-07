class FilteredAccount extends Account
{
    private int count = 0;
    public FilteredAccount(int accno)
    {
        super(accno);
    }
    public boolean process(Transaction t)
    {
        if(t.value() == 0)
        {
            count++;
            return true;
        }
        else
        {
            return super.process(t);
        }
    }
    public int filtered()
    {
        return count;
    }
}