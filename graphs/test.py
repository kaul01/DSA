def karatsuba_mult(x, y):
    """
    Computes the product of integers x, y using 3-way Karatsuba's algorithm (Toom-Cook-3).
    
    Parameters:
        x: The first multiplicand.
        y: The second multiplicand.
        
    Returns:
        The product x * y.
    """
    import math
    
    len_x = int(math.log10(abs(x))) + 1 if x != 0 else 1
    len_y = int(math.log10(abs(y))) + 1 if y != 0 else 1

    if len_x < 4 or len_y < 4:
        return x * y
    else:
        new_n = max(len_x, len_y)
        third_n = new_n // 3
        
        # Split x into 3 parts: x = a*10^(2*third_n) + b*10^third_n + c
        power_2third = 10**(2*third_n)
        power_third = 10**third_n
        
        a, remainder_x = divmod(x, power_2third)
        b, c = divmod(remainder_x, power_third)
        
        # Split y into 3 parts: y = d*10^(2*third_n) + e*10^third_n + f
        d, remainder_y = divmod(y, power_2third)
        e, f = divmod(remainder_y, power_third)
        
        # Compute the 5 products needed for 3-way Karatsuba
        # p0 = c * f
        p0 = karatsuba_mult(c, f)
        
        # p1 = (b + c) * (e + f)
        p1 = karatsuba_mult(b + c, e + f)
        
        # p2 = (a + b + c) * (d + e + f)
        p2 = karatsuba_mult(a + b + c, d + e + f)
        
        # p3 = (a + b) * (d + e)
        p3 = karatsuba_mult(a + b, d + e)
        
        # p4 = a * d
        p4 = karatsuba_mult(a, d)
        
        # Compute intermediate values
        # q0 = p0
        q0 = p0
        
        # q1 = p1 - p0 - p3
        q1 = p1 - p0 - p3
        
        # q2 = p2 - p1 - p3 + p0
        q2 = p2 - p1 - p3 + p0
        
        # q3 = p3 - p4 - p0
        q3 = p3 - p4 - p0
        
        # q4 = p4
        q4 = p4
        
        # Combine results: q4*10^(4*third_n) + q3*10^(3*third_n) + q2*10^(2*third_n) + q1*10^third_n + q0
        result = (q4 * 10**(4*third_n) + 
                 q3 * 10**(3*third_n) + 
                 q2 * 10**(2*third_n) + 
                 q1 * power_third + 
                 q0)
        
        return result


print(karatsuba_mult(10000, 20000))


function findFFT(A, n):





