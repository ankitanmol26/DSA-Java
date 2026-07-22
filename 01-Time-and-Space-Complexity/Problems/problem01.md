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

another question
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i * i; j++) {

    }

}
ANS : the outer loop starts from 1 and ends when it is n and it multipies everyelement with 2 so its TC is O(log n ), the inner loop starts from 0 and ends when j is less than i square and increments 
dry run for n is 5 so it becomes 

Q1. 
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i * 3; j++) {

    }

}
ANS: the outer loop starts from 1 and ends when it is n and it multiplies every element by 2 , so its TC is O(log n ) and the inner loop starts from 0 and it ends when j is less than i times 3 and it is increasing , 
dry run for n is 5
0       0 
1       3
2       6
4       12
6       18
so the inner loop TC is O(n square) , so the final is O(n square log n )

Q2.
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i * i * i; j++) {

    }

}

ANS: the outer loop starts from 1 and ends when it is n and it multiplies every element by 2 , so its TC is O(log n ) and the inner loop starts from 0 and it ends when j is less than i square and it increasing
dry run n is 5
0       0 
1       1
2       4
4       16
6       64
so the inner loops TC is O(n square), so the final TC is O(n square log n )

Q3. 
for(int i = n; i > 1; i /= 2) {

    for(int j = 0; j < i; j++) {

    }

}
ANS: the outer loop starts from n and ends when it is i is 0 and every element is divided by 2 , so its TC O(n/2) but acc to big O its TC is O(n) and the inner loop starts from 0 and ends when j is less than i and it increments , so its TC is O(n) , so the final TC is O(n)
the above answers re completely wrong
------------
Q1
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i * 3; j++) {

    }

}
Your mistake

You wrote:

Inner loop = O(n²)

❌ Where did n² come from?

Let's make the table.

Suppose:

n = 16

Outer loop values:

i	Inner iterations (i*3)
1	3
2	6
4	12
8	24

Now add them.

3 + 6 + 12 + 24

Factor out the 3:

3 × (1 + 2 + 4 + 8)

We already know:

1 + 2 + 4 + 8 = O(n)

Multiplying by 3 doesn't matter.

Final answer:

O(n)

✅ Correct Answer: O(n)

Q2
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i * i * i; j++) {

    }

}

You accidentally wrote i² instead of i³.

Let's make the table.

i	i³	Inner iterations
1	1	1
2	8	8
4	64	64
8	512	512

Now add them.

1 + 8 + 64 + 512

This is a geometric series with ratio 8.

The last term dominates.

The last term is approximately:

n³

Therefore:

O(n³)

✅ Correct Answer: O(n³)

Q3
for(int i = n; i > 1; i /= 2) {

    for(int j = 0; j < i; j++) {

    }

}

This is the most important one.

You wrote:

Outer = O(n)

❌ No.

Look at the outer loop.

n
n/2
n/4
n/8
...

Dividing by 2 each time means:

O(log n)

Not O(n).

Now make the table.

Suppose:

n = 16
i	Inner iterations
16	16
8	8
4	4
2	2

Total:

16 + 8 + 4 + 2

This is another geometric series.

Its total is:

O(n)

✅ Correct Answer: O(n)

Notice something interesting:

Outer loop alone = O(log n)
Overall algorithm = O(n)

This surprises many students at first.

🚨 The Big Mistake

You are still thinking like this:

Outer = something

Inner = something

Multiply

That only works when the inner loop does the same amount of work every time.

Here's the rule you should memorize
Rule 1 ✅ Independent loops
for(i=0;i<n;i++)
    for(j=0;j<n;j++)

Multiply.

Rule 2 ✅ Inner depends on i
for(i=0;i<n;i++)
    for(j=0;j<i;j++)

❌ Don't multiply.

Make a table.

Rule 3 ✅ Outer changes exponentially
i *= 2

and the inner depends on i.

❌ Don't multiply.

Make a table.


Question
for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i * i; j++) {

    }

}

for 
inner   outer
1        1
2        4 
4        16
8        64
now the inner becomes 1+4+16+64 = 125
so the inner TC is O(n square) and outer TC is O(log n ), so final becomes O(n square log n)