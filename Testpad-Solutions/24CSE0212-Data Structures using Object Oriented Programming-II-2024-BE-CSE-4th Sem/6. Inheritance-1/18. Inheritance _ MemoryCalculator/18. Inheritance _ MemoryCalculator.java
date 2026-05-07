class MemoryCalculator extends Calculator
{
    private Map<Integer, Integer> map = new HashMap<>();
    private int computeCount = 0;
    private int memoCount = 0;
    public MemoryCalculator(int seed)
    {
        super(seed);
    }
    public int kthPrime(int k)
    {
        if(map.containsKey(k))
        {
            memoCount++;
            return map.get(k);
        }
        else
        {
            int val = super.kthPrime(k);
            map.put(k, val);
            computeCount++;
            return val;
        }
    }
    public int getComputeCount()
    {
        return computeCount;
    }
    public int getMemoCount()
    {
        return memoCount;
    }
}