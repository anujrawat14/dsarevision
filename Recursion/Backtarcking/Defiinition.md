# Backtracking — Recursion & Maze Notes

## General Definition

> **Backtracking is an algorithmic technique where we make a change, explore the possibilities, and then revert (undo) the change to try another possibility.**

### In simple words

**Make a change → Explore → Revert the change**

---

## Key Idea

The most important part of backtracking is the **undo/revert step**.

```java
make a change;

// explore using recursion

revert the change;
```
## Backtracking vs Recursion

These two concepts are related, but they are **not the same**.

### Recursion

> **Recursion means a function calls itself to solve a smaller part of the problem.**

### Backtracking

> **Backtracking means making a change, exploring a choice, and then undoing that change so another choice can be tried.**

### Together

```text
Recursion → takes us deeper into a path
Backtracking → restores the state when we come back
```

---

## Maze Example

Suppose we have a maze and we can move:

```text
D → Down
R → Right
U → Up
L → Left
```

When we enter a cell, we mark it as visited:

```java
maze[r][c] = false;
```

Then we recursively explore all possible directions.

After all those recursive calls are finished:

```java
maze[r][c] = true;
```

This restores the cell so another path can use it.

### Why do we restore it?

Imagine:

```text
Path 1: Start → A → B → dead end
```

After Path 1 fails, we need to go back to `A` and try another path:

```text
Path 2: Start → A → C → ...
```

If we don't restore the state, `A` might remain marked as visited and Path 2 could incorrectly be prevented from using it.

---

## The Backtracking Pattern

```java
// 1. Make a change
maze[r][c] = false;

// 2. Explore all possible choices
// D
// R
// U
// L

// 3. Revert the change
maze[r][c] = true;
```

Think:

```text
        Make a choice
              ↓
           Explore
              ↓
        Choice finished
              ↓
          Undo choice
              ↓
       Try another choice
```

---

## One-Line Definition

> **Backtracking = Make a change → Explore → Revert the change.**

---

## Important Point

The **revert/undo step** is what makes the technique backtracking.

For example:

```java
maze[r][c] = false;  // change

// recursion explores the path

maze[r][c] = true;   // undo
```

Without restoring the state, we are not properly backtracking.
