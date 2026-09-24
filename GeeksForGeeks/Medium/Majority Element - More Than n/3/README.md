# Majority Element - More Than n/3

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/majority-vote/1)

## Solved On
24 Sept 2026 at 01:40 pm

<h2><a href="https://www.geeksforgeeks.org/problems/majority-vote/1">Majority Element - More Than n/3</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span class="cf0" style="font-size: 18.6667px;">Given an array </span><strong style="font-size: 18.6667px;">arr</strong><span class="cf0" style="font-size: 18.6667px;"><strong>[]</strong> consisting of <strong>n</strong> integers, find all the array elements which occurs more than <strong>floor(n/3)</strong> times. Return the resulting array in strictly increasing order. If no such elements exist, return an empty array.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 14pt;"><span class="cf0">arr</span><span class="cf0">[] = [2, 2, 3, 1, 3, 2, 1, 1]</span></span><span style="font-size: 18px;">
<strong>Output: </strong><span class="cf0">[1, 2]</span>
<strong>Explanation: </strong></span><span style="font-size: 14pt;">The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong> <span class="cf0">arr</span><span class="cf0">[] = [-5, 3, -5]</span>
<strong>Output: </strong><span class="cf0">[-5]</span><br><strong>Explanation:<span style="font-size: 14pt;"> </span></strong></span><span style="font-size: 14pt;">The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).<br></span></pre><pre><strong><span style="font-size: 14pt;">Input: </span></strong> <span style="font-size: 14pt;"><span class="cf0">arr</span><span class="cf0">[] = [3, 2, 2, 4, 1, 4]</span></span><strong><span style="font-size: 14pt;"><br>Output: </span></strong><span style="font-size: 14pt;">[]</span><strong><span style="font-size: 14pt;"><br>Explanation: </span></strong><span style="font-size: 14pt;">There is no majority element.</span></pre>