when a function calls itself
until a specifical condition is met.
in that we have a base condition(which will terminate the function calls)


Recurrence Relation:
A recurrence relation is an equation that recursively defines a sequence, where each term is a function of the preceding terms.

Example:

Fibonacci sequence:
F(n) = F(n-1) + F(n-2) with base cases F(0) = 0 and F(1) = 1.

Recursive solution for Fibonacci:

function fib(n) {
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
}
