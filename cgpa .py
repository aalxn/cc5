def calculate_cgpa(grades_and_credits):
    total_credit_points = 0
    total_credits = 0

    for grade, credit in grades_and_credits:
        # Assign numerical values to grades (e.g., 'A' -> 4.0, 'B' -> 3.0, etc.)
        grade_points = {'S': 10, 'A': 9, 'B': 8, 'C': 7, 'D': 6, 'F': 0}
        total_credit_points += grade_points.get(grade.upper(), 0) * credit
        total_credits += credit

    cgpa = total_credit_points / total_credits
    return cgpa

# Example usage:
grades_and_credits = [('A', 4), ('B', 3), ('S', 2)]  # Replace with your actual grades and credits
result_cgpa = calculate_cgpa(grades_and_credits)
print(f"Your CGPA is: {result_cgpa:.2f}")
