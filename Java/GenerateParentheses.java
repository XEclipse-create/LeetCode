class Solution {
    List<String> list = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        dfs(new StringBuilder(), 0, n);
        return list;
    }
    
    private void dfs(StringBuilder s, int cl, int n )
    {
        
        if(n==0 && cl==0){
            list.add(s.toString());
            return;
            }
        
        if(n>0)
        {
            s.append('(');
            dfs(s, cl+1, n-1);
            s.setLength(s.length()-1);
        }
        
        if(cl>0)
        {
            s.append(')');
            dfs(s, cl-1, n);
            s.setLength(s.length()-1);
        }
        return;
    }
}