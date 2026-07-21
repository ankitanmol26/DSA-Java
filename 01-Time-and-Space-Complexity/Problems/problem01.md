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


Q1.for(int i = 0; i < n; i += 5) {
}
ANS : it starts from 0 and ends at n and it adds numbers by +5 then the TC is O(n/5) but bigO removes the constants so the TC is O(n)

Q2. for(int i = n; i > 0; i -= 3) {
}
ANS: it starts from n and ends when 0 and it substract every no by 3 still according to the bigO the TC is O(n).

Q3. for(int i = 1; i < n; i *= 5) {
}
ANS: it starts from 1 and ends when it is n and it multiplied every number with 5 so it is logarthmetic so the TC is O(log n )

Q4. for(int i = n; i > 100; i--) {
}
ANS: it starts from n and ends when it is greater than 100 and it decrements and it exactly decrements till 100 is a constant so it the TC is O(1)

-----------------------------------------------------------------------------------------
Q1.for(int i=0;i<n;i++) {

    for(int j=1;j<n;j*=2) {

    }

}
ANS: the outer loop runs for n times so its TC is O(n) and the inner loop starts from 1 and ends when n and every no multiplies with 2 so its TC is O(log n) so the both are nested loops so the TC becomes O (nlog n).


Q2.for(int i=1;i<n;i*=2) {

    for(int j=0;j<n;j++) {

    }

}
ANS: the outer loops starts from 1 and ends when it is n and the every no multiplies with 2 so its TC is O(log n) and the inner loop starts from 0 and ends when it is n and it increments so its TC is O(n) and then the TC becomes O (n log n ).

Q3. for(int i=1;i<n;i*=2) {

    for(int j=1;j<n;j*=2) {

    }

}
ANS: the outer loops starts from 1 and ends when it is n and every no multiplies with 2 so its TC is O(log n ) and inner loop starts from 1 and ends when it is n and every no multiplies with 2 so its TC is O(log n ) so the TC becomes O(log square n ).

Q4.for(int i=0;i<n;i++) {

    for(int j=0;j<=i;j++) {

    }

}
ANS : the outer loop starts from 0 and ends when it is n and incrnements so its TC is O(n) and the inner loop starts from 0 and ends when i it is less than and it increments and the TC (n)and it the TC becomes O(n square) 

bonus question 
for(int i = 0; i < n; i++) {

    for(int j = i; j < n; j++) {

    }

}
ANS: the outer loop starts from 0 and ends when it is n and it increments so the TC is O(n) and the inner loop starts when the outer loop starts suppose outer i is 0 then j is also 0 coz it is i=j so and it ends when it is n and it increments so the TC is O(n) so the TC becomes O(n square)


important question
for(int i = 0; i < n; i++) {

    for(int j = i; j < n; j += 2) {

    }

}
ANS: the outer loop starts from 0 and ends when it is n and it increments so its TC is O(n) and the inner loop starts from as i coz it is same i and j and in the inner loop for every itreation it varies like n , n-1 .. or same as 1 + 2 .. +n so it runs but still its TC is O(n) so the final TC is O(n square)
another question 
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i; j++) {

    }

}
ANS: the outer loop starts from 1 and ends when it is n and it multiplies everyelement with 2 so its TC is O(log n) and the inner loop starts from 0 and ends when j is less than i and it increments . for every outer loop run the inner loop runs and increments the inner loop TC is O(n) so the TC becomes O(n log n) i genueninly not getting that but tried
