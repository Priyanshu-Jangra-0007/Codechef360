        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.valueOf(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());;
            
            String a[][] = new String[n][n];
            
            for (int i = 0 ; i < n ; i++ ) {
                
                String temp = br.readLine();
                
                String sArr [] = temp.split( " " );
                
                for (int j = 0 ; j < n ; j++ ) {
                    a[n - i - 1][n - j - 1] = sArr[j];
                }
            }
            
            for( String[] r : a ){
                out.println(Arrays.toString(r).replace(",", "").replace("[", "").replace("]", 
                    "").trim());
            }
        }
        out.close();
    }
}
