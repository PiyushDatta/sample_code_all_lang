package main

import "fmt"

// Employee : sample struct
type Employee struct {
	/*
	   multi-line comment
	*/
	FirstName   string
	LastName    string
	TotalLeaves int
}

// LeavesRemaining : Employee method
func (e Employee) LeavesRemaining() {
	fmt.Printf("%s %s has %d leaves remaining\n", e.FirstName, e.LastName, e.TotalLeaves)
}

// JustName : sample code
func JustName(e Employee) {
	fmt.Printf("%s %s \n", e.FirstName, e.LastName)
}

func main() {
	var FirstName = "first"
	LastName := "last"
	var TotalLeaves int = 5
	employee := Employee{FirstName: FirstName, LastName: LastName, TotalLeaves: TotalLeaves}
	var debug bool = true

	if debug {
		for i := 0; i < 1; i++ {
			employee.LeavesRemaining()
			JustName(employee)
		}
	} else {
		fmt.Printf("hello, world\n")
	}
}
