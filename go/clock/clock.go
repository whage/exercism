package clock

import (
	"fmt"
)

const testVersion = 4

type Clock int

func New(hour, minute int) Clock {
	total := (hour * 60 + minute) % 1440;

	if total < 0 {
		total = 1440 + total
	}

	return Clock(total)
}

func (c Clock) String() string {
	var hours, minutes int

	if int(c) >= 0 {
		hours = (int(c) / 60) % 24
		minutes = int(c) % 60
	} else {
		var hourInit int

		if int(c) % 60 != 0 {
			hourInit = 23
		} else {
			hourInit = 24
		}

		minutes = (60 + (int(c) % 60)) % 60
		hours = hourInit + (int(c) / 60 % 24)
	}

	return fmt.Sprintf("%02d:%02d", hours, minutes)
}

func (c Clock) Add(minutes int) Clock {
	return Clock((int(c) + minutes) % 1440)
}