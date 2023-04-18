import math

# 1 + ((floor n ∙ 40pi^2) mod 12)
def gen1(n):
  return 1 + ((math.floor(n * (40 * (math.pi ** 2)))) % 12 )

# 1 + ((floor n ∙ 50e^2) mod 12)
def gen2(n):
  return 1 + ((math.floor(n * (50 * (math.e ** 2)))) % 12 )

# 1 + ((floor n ∙ 40e^3) mod 12)
def gen3(n):
  return 1 + ((math.floor(n * (40 * (math.e ** 3)))) % 12 )

# 1 + ((floor n ∙ 50e^3) mod 12)
def gen4(n):
  return 1 + ((math.floor(n * (50 * (math.e ** 3)))) % 12 )

# 1 + ((floor n ∙ 40e^2) mod 12)
def gen5(n):
  return 1 + ((math.floor(n * (40 * (math.e ** 2)))) % 12 )

# 1 + ((floor n ∙ 60e^3) mod 12)
def gen6(n):
  return 1 + ((math.floor(n * (60 * (math.e ** 3)))) % 12 )