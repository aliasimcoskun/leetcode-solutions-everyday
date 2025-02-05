bool areAlmostEqual(char* s1, char* s2) {
    // s1 and s2 have equal number of characters
    int i=0;
    while(s1[i]!='\0'){
        // printf("i: %d\n", i);
        int j=i;
        while(s2[j]!='\0'){
            // printf("j: %d\n", j);
            // printf("s1[i] = %c and s2[j] = %c\n", s1[i], s2[j]);
            if(s1[i]==s2[j] && s1[j]==s2[i]){
                char temp1=s1[j];
                char temp2=s1[i];
                s1[j]=s2[j];
                s1[i]=s2[i];
                // printf("AAA: s1[i] = %c and s2[i] = %c\n", s1[i], s2[i]);
                if(strcmp(s1,s2)==0) return 1;
                s1[j]=temp1;
                s1[i]=temp2;
            }
            j++;
        }
        i++;
    }
    return 0;
}