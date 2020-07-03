import pandas as pd                                        #import the package pandas to read content of csv file
from itertools import permutations                         #import the permutations package from itertools

def find_permutation(str):                                 #function to find the permutation of the string
    perms=["".join(p) for p in permutations(string)]       #use permutation() method of itertools 
    print(*perms,sep=",")                                  #print the obtained permutations separated by ','

v=pd.read_csv("input.csv")                               #read the data from input.csv file and storing the list in v
for string in v:                                          #for loop to iterate through the list v 
    string=list(string.strip())                           
    find_permutation(string)                              #call the function to find the permutation of the string
    