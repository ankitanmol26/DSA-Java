Store information so that you can retrieve it quickly instead of repeatedly searching through the whole array.

Absolutely. Let's learn `HashMap` from **zero**, especially in the context of the LeetCode problems you're solving.

 ## 1\. What is a HashMap?

 A `HashMap` stores data as **key → value** pairs.

 Think of it like a dictionary:

```
Word       Meaning
-----------------------
apple   →  fruit
java    →  language
cat     →  animal
```

 In Java:

```
HashMap<String, String> map = new HashMap<>();
```

 Here:

 - `String` before the comma = **key**
- `String` after the comma = **value**

 So:

```
map.put("apple", "fruit");
```

 means:

```
apple → fruit
```

---

 # 2\. How to create a HashMap

 First import it:

```
import java.util.HashMap;
```

 Then:

```
HashMap<Integer, Integer> map = new HashMap<>();
```

 This means:

```
key   → value
Integer → Integer
```

 For example:

```
HashMap<Integer, Integer> map = new HashMap<>();

map.put(10, 100);
map.put(20, 200);
map.put(30, 300);
```

 Now conceptually:

```
10 → 100
20 → 200
30 → 300
```

---

 # 3\. `put()` — add data

 The most important method:

```
map.put(key, value);
```

 Example:

```
map.put(5, 10);
```

 means:

```
5 → 10
```

 Another:

```
map.put(7, 20);
```

 means:

```
5 → 10
7 → 20
```

---

 # 4\. `get()` — get a value

 Suppose:

```
HashMap<Integer, Integer> map = new HashMap<>();

map.put(5, 10);
map.put(7, 20);
```

 You can do:

```
System.out.println(map.get(5));
```

 Output:

```
10
```

 Because:

```
5 → 10
```

 So:

```
map.get(5)
```

 means:

 > "Give me the value associated with key `5`."

---

 # 5\. The most important concept: counting

 This is where `HashMap` becomes extremely useful in LeetCode.

 Suppose:

```
int[] nums = {3, 3, 4, 3, 4};
```

 We want to count how many times each number occurs.

 We want:

```
3 → 3
4 → 2
```

 Meaning:

```
3 appears 3 times
4 appears 2 times
```

 We can use:

```
HashMap<Integer, Integer> map = new HashMap<>();
```

 Initially:

```
{}
```

 Now see each number.

 ### First `3`

```
map.put(3, 1);
```

 Map:

```
3 → 1
```

 ### Second `3`

 We want:

```
3 → 2
```

 So:

```
map.put(3, 2);
```

 ### `4`

```
map.put(4, 1);
```

 Now:

```
3 → 2
4 → 1
```

 And so on.

---

 # 6\. But how do we increase the count automatically?

 This is the line you saw earlier:

```
map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
```

 It looks scary at first, so let's break it down.

 Suppose:

```
nums[i] = 3;
```

 We do:

```
map.getOrDefault(3, 0)
```

 It means:

 > Give me the value for key `3`. If `3` doesn't exist, give me `0`.

 ### If 3 doesn't exist

```
map = {}
```

 Then:

```
map.getOrDefault(3, 0)
```

 returns:

```
0
```

 Then:

```
0 + 1
```

 = `1`

 So:

```
map.put(3, 1);
```

 Now:

```
3 → 1
```

---

 ### Next time we see 3

 Now:

```
3 → 1
```

 This:

```
map.getOrDefault(3, 0)
```

 returns:

```
1
```

 Then:

```
1 + 1
```

 = `2`

 So:

```
map.put(3, 2);
```

 Now:

```
3 → 2
```

 That's how we count frequencies.

---

 # 7\. Your majority-element problem

 Now your original problem becomes much easier to understand.

```
class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > n / 2) {
                return nums[i];
            }
        }

        return nums[0];
    }
}
```

 Let's take:

```
[3, 3, 4]
```

 ### i = 0

 `nums[i] = 3`

```
map.put(3, 0 + 1);
```

 Map:

```
3 → 1
```

 Check:

```
1 > 3/2
```

```
1 > 1 → false
```

---

 ### i = 1

 Again `3`.

```
map.put(3, 1 + 1);
```

 Map:

```
3 → 2
```

 Check:

```
2 > 1
```

 True!

 So:

```
return 3;
```

 Done. ✅

---

 # 8\. `containsKey()`

 Another very useful method:

```
map.containsKey(3)
```

 It asks:

 > "Does key `3` exist?"

 Example:

```
HashMap<Integer, Integer> map = new HashMap<>();

map.put(3, 10);

System.out.println(map.containsKey(3));
```

 Output:

```
true
```

 But:

```
System.out.println(map.containsKey(5));
```

 Output:

```
false
```

---

 # 9\. `remove()`

 You can remove a key:

```
map.remove(3);
```

 If you had:

```
3 → 10
4 → 20
```

 after:

```
map.remove(3);
```

 you have:

```
4 → 20
```

---

 # 10\. HashMap with Strings

 HashMap isn't only for integers.

 For example, count characters:

```
String s = "banana";
```

 We want:

```
b → 1
a → 3
n → 2
```

 Code:

```
HashMap<Character, Integer> map = new HashMap<>();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
```

 This pattern is **extremely important** for coding problems.

---

 # 11\. The 5 HashMap methods you should learn first

 Don't try to memorize everything. Start with these:

 | Method | Meaning |
| --- | --- |
| `put(key, value)` | Add/update |
| `get(key)` | Get value |
| `getOrDefault(key, value)` | Get value, or default if absent |
| `containsKey(key)` | Check if key exists |
| `remove(key)` | Delete key |

 The most important pattern for you right now is:

```
map.put(key, map.getOrDefault(key, 0) + 1);
```

 Whenever you see a problem saying:

 > **"Count how many times..."**

 you should immediately think:

 **HashMap.** 🧠

 Next, a good exercise for you is to try writing a program that counts the frequency of every number in `[1, 2, 2, 3, 3, 3, 4]` using `HashMap`.