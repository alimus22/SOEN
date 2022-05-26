# search.py
# ---------
# Licensing Information:  You are free to use or extend these projects for
# educational purposes provided that (1) you do not distribute or publish
# solutions, (2) you retain this notice, and (3) you provide clear
# attribution to UC Berkeley, including a link to http://ai.berkeley.edu.
#
# Attribution Information: The Pacman AI projects were developed at UC Berkeley.
# The core projects and autograders were primarily created by John DeNero
# (denero@cs.berkeley.edu) and Dan Klein (klein@cs.berkeley.edu).
# Student side autograding was added by Brad Miller, Nick Hay, and
# Pieter Abbeel (pabbeel@cs.berkeley.edu).


"""
In search.py, you will implement generic search algorithms which are called by
Pacman agents (in searchAgents.py).
"""

import util


class SearchProblem:
    """
    This class outlines the structure of a search problem, but doesn't implement
    any of the methods (in object-oriented terminology: an abstract class).

    You do not need to change anything in this class, ever.
    """

    def getStartState(self):
        """
        Returns the start state for the search problem.
        """
        util.raiseNotDefined()

    def isGoalState(self, state):
        """
          state: Search state

        Returns True if and only if the state is a valid goal state.
        """
        util.raiseNotDefined()

    def getSuccessors(self, state):
        """
          state: Search state

        For a given state, this should return a list of triples, (successor,
        action, stepCost), where 'successor' is a successor to the current
        state, 'action' is the action required to get there, and 'stepCost' is
        the incremental cost of expanding to that successor.
        """
        util.raiseNotDefined()

    def getCostOfActions(self, actions):
        """
         actions: A list of actions to take

        This method returns the total cost of a particular sequence of actions.
        The sequence must be composed of legal moves.
        """
        util.raiseNotDefined()


def tinyMazeSearch(problem):
    """
    Returns a sequence of moves that solves tinyMaze.  For any other maze, the
    sequence of moves will be incorrect, so only use this for tinyMaze.
    """
    from game import Directions
    s = Directions.SOUTH
    w = Directions.WEST
    return [s, s, w, s, w, w, s, w]


def depthFirstSearch(problem):
    """
    Search the deepest nodes in the search tree first.

    Your search algorithm needs to return a list of actions that reaches the
    goal. Make sure to implement a graph search algorithm.

    To get started, you might want to try some of these simple commands to
    understand the search problem that is being passed in:

    print("Start:", problem.getStartState())
    print("Is the start a goal?", problem.isGoalState(problem.getStartState()))
    print("Start's successors:", problem.getSuccessors(problem.getStartState()))
    """
    "*** YOUR CODE HERE ***"

    open = util.Stack()
    closed = {}
    solution = []
    start = problem.getStartState()

    if problem.isGoalState(start):
        return solution

    open.push((start, '', 0, ''))

    while not (open.isEmpty()):
        node = open.pop()
        closed[node[0]] = (node[3], node[1])
        if problem.isGoalState(node[0]):
            current = node[0]
            closed[node[0]] = (node[3], node[1])
            break

        for child in problem.getSuccessors(node[0]):
            if child[0] not in closed.keys():
                open.push((*child, node[0]))

    while current in closed.keys():
        if current == problem.getStartState():
            break
        solution.insert(0, closed[current][1])
        current = closed[current][0]

    return solution


def breadthFirstSearch(problem):
    """Search the shallowest nodes in the search tree first."""
    open = util.Queue()
    closed = {}
    solution = []
    visited = []
    start = problem.getStartState()

    if problem.isGoalState(start):
        return solution

    open.push((start, '', 0, ''))
    visited.insert(0, start)

    while not (open.isEmpty()):
        node = open.pop()
        closed[node[0]] = (node[3], node[1])
        if problem.isGoalState(node[0]):
            current = node[0]
            closed[node[0]] = (node[3], node[1])
            break

        for child in problem.getSuccessors(node[0]):
            if child[0] not in closed.keys() and child[0] not in visited:
                open.push((*child, node[0]))
                visited.insert(0, child[0])

    while current in closed.keys():
        if current == problem.getStartState():
            break
        solution.insert(0, closed[current][1])
        current = closed[current][0]

    return solution

    util.raiseNotDefined()


def uniformCostSearch(problem):
    """Search the node of least total cost first."""
    "*** YOUR CODE HERE ***"
    open = util.PriorityQueue()
    closed = {}
    solution = []
    visited = []
    costDict = {}
    start = problem.getStartState()

    if problem.isGoalState(start):
        return solution

    open.push((start, '', 0, '', 0), 0)
    visited.insert(0, start)
    costDict[start] = 0

    while not (open.isEmpty()):
        node = open.pop()
        closed[node[0]] = (node[3], node[1])
        if problem.isGoalState(node[0]):
            current = node[0]
            closed[node[0]] = (node[3], node[1])
            break

        for child in problem.getSuccessors(node[0]):
            cost = node[4] + child[2]
            if not (child[0] in closed.keys() and child[0] in visited):
                if not (child[0] in costDict and costDict[child[0]] <= cost):
                    open.push((*child, node[0], cost), cost)
                    visited.insert(0, child[0])
                    costDict[child[0]] = cost

    while current in closed.keys():
        if current == problem.getStartState():
            break
        solution.insert(0, closed[current][1])
        current = closed[current][0]

    return solution
    util.raiseNotDefined()


def nullHeuristic(state, problem=None):
    """
    A heuristic function estimates the cost from the current state to the nearest
    goal in the provided SearchProblem.  This heuristic is trivial.
    """
    return 0


def aStarSearch(problem, heuristic=nullHeuristic):
    """Search the node that has the lowest combined cost and heuristic first."""
    "*** YOUR CODE HERE ***"
    util.raiseNotDefined()


# Abbreviations
bfs = breadthFirstSearch
dfs = depthFirstSearch
astar = aStarSearch
ucs = uniformCostSearch
