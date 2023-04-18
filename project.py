from generators import *
from collections import defaultdict

# generate puzzle for each generator function
def generate(func):
    # each # can only be seen 3 times, if seen 3 times then skip
    seen = defaultdict(int)
    res = []
    tier = []
    # total generated, set to 0 at start
    total = 0
    # n = 1 at start, can be > 36 if more than 3 of a number is made
    n = 1
    # if total is 36, done
    while total < 36:
        # grab current generated value
        cur = func(n)
        n += 1
        # increase seen of cur value
        seen[cur] += 1
        # if seen > 3, skip cur value, generate next
        if seen[cur] > 3:
           continue
        # else add to current tier
        tier.append(cur)
        # current tier is full, add to result and reset tier
        if len(tier) == 3:
            res.append(tier)
            tier = []
        # increment total generated
        total += 1
    return res

# returns dictionary of lists, key: generator function #, value: generated puzzle
# value format: [[1, 2, 3], [4, 5, 6], .... [34, 35, 36]]
def main():
    # dictionary of generated puzzles
    res = defaultdict(list)
    # list of functions for puzzle generation
    gens = [gen1, gen2, gen3, gen4, gen5, gen6]
    for idx, func in enumerate(gens):
        res[idx + 1] += generate(func)
    for key, value in res.items():
        print(f'Generator {key}: {value}')
    return

if __name__ == '__main__':
    main()