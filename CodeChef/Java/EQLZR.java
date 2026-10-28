            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=0;
            int []l=new int[n];
            int []r=new int[n];
            for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]) ans++;
                l[i+1]=(a[i]==a[i+1]+1)?1:0;
                r[i]=(a[i]+1==a[i+1])?1:0;
                if(a[i]==a[i+1]){
                    l[i+1]=-1;
                    r[i]=-1;
                }
            }
            int b=0;
            int pref=0;
            for(int i=0;i<n;i++){
                pref=Math.max(pref,l[i]);
                b=Math.max(b,pref+r[i]);
            }
            System.out.println(ans+b);
        }
    }
}
