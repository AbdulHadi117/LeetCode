public class crawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        int result = helper(logs);

        System.out.println(result);
    }

    public static int helper(String[] logs) {
        int level = 0; // level of the log folder

        for (String log : logs) {
            if (log.equals("../")){
                // move up one level to parent i.e. decrease the level by 1
                // stay at same folder if already at root level
                level = Math.max(level - 1, 0);
            } else if (!log.equals("./")){
                // move down one level to child i.e. increase the level by 1
                level += 1;
            }
        }

        return level;
    }
}
