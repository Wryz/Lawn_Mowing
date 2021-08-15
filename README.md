# Lawn-Mowing
The Lawn Mowing application determines an optimal route to mow a lawn.


**PROBLEM STATEMENT**
The algorithm closely follows the Traveling Salesman problem: https://www.geeksforgeeks.org/travelling-salesman-problem-greedy-approach/
It will help to determine the shortest path to visit all verticies at least once. It is computed given a 2D array of *weights* or the cost of travel, and *n* the amount of nodes to visit, where it seeks to find lowest cost of a path of n verticies.

The lawn is made of many verticies which *optimally* should only be visted once. The task is to create an algorithm that (given a 2D array of 1's and 0's, and a starting position within that array) can find the shortest route to visitng each element in the array and back to it's starting position.
1's will be represented as a patch of grass and 0's will be represented as obstacles. Once a patch of grass has been visited it will turn into a 0, and it may be stored elsewhere to be called upon in the event that the algorithm is required to go over already-cut-grass to get to a patch of uncut grass, or the end point.

Efficiency of a path is determined by the total number of 1's in the 2D array, over the patches of grass that the algorithm has to run over.

More info can be read from this wiki of the TSP: https://en.wikipedia.org/wiki/Travelling_salesman_problem
