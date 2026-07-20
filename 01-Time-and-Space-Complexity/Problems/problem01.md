Q1. 
for(int i = 0; i < 5*n; i++) {
}
ANS: the TC is O(n) coz the loop runs 5 times but the big O consider it as O(n) coz it ignores constants

Q2.
for(int i = 0; i < n*n; i++) {
}
ANS: the TC is O(n square ) coz it for every n their is another n

Q3.
for(int i = 0; i < n; i++) {
}

for(int j = 0; j < n; j++) {
}
ANS:the loops are outside not nested so it is O(n) for both.


NOTE : For nested multiply 
       For sequential add
       Constants ignore
