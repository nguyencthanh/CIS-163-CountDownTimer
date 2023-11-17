package Project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountDownTimer {
    private static boolean suspends = false;
    private int hours;
    private int minutes;
    private int seconds;

    public CountDownTimer() {
        if (!isSuspended()) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public CountDownTimer(int hours, int minutes, int seconds) {
        if (!isSuspended()) {
            if (hours >= 0 && minutes > -1 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public CountDownTimer(int minutes, int seconds) {
        if (!isSuspended()) {
            if (minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
                this.minutes = minutes;
                this.seconds = seconds;
                this.hours = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public CountDownTimer(int seconds) {
        if (!isSuspended()) {
            if (seconds >= 0 && seconds <= 59) {
                this.seconds = seconds;
                this.hours = 0;
                this.minutes = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public CountDownTimer(CountDownTimer other) {
        if (!isSuspended()) {
            if (other != null) {
                this.hours = other.hours;
                this.minutes = other.minutes;
                this.seconds = other.seconds;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public CountDownTimer(String startTime) {
        if (!isSuspended()) {
            if (!startTime.matches("\\d+:\\d{2}:\\d{2}") && !startTime.matches("\\d{2}:\\d{2}") && !startTime.matches("\\d{2}")) {
                throw new IllegalArgumentException();
            } else {
                String[] splitArray = startTime.split(":");
                if (splitArray.length <= 3 && splitArray.length > 0) {
                    int m;
                    int s;
                    if (splitArray.length == 3) {
                        int h = Integer.parseInt(splitArray[0]);
                        m = Integer.parseInt(splitArray[1]);
                        s = Integer.parseInt(splitArray[2]);
                        if (h < 0 || m < 0 || m >= 60 || s < 0 || s >= 60) {
                            throw new IllegalArgumentException();
                        }

                        this.hours = h;
                        this.minutes = m;
                        this.seconds = s;
                    } else if (splitArray.length == 2) {
                        m = Integer.parseInt(splitArray[0]);
                        s = Integer.parseInt(splitArray[1]);
                        if (m >= 0 && m < 60 && s >= 0 && s < 60) {
                            this.minutes = m;
                            this.seconds = s;
                        }
                    } else {
                        s = Integer.parseInt(splitArray[0]);
                        if (s >= 0 && s < 60) {
                            this.seconds = s;
                        }
                    }

                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean equals(CountDownTimer t1, CountDownTimer t2) {
        if (!isSuspended()) {
            if (t1 != null && t2 != null) {
                return t1.hours == t2.hours && t1.minutes == t2.minutes && t1.seconds == t2.seconds;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int compareTo(CountDownTimer t1, CountDownTimer t2) {
        int tempReturn = 0;
        if (!isSuspended()) {
            if (t1 != null && t2 != null) {
                int totalSecondsT1 = t1.hours * 60 * 60;
                totalSecondsT1 += t1.minutes * 60;
                totalSecondsT1 += t1.seconds;
                int totalSecondsT2 = t2.hours * 60 * 60;
                totalSecondsT2 += t2.minutes * 60;
                totalSecondsT2 += t2.seconds;
                if (totalSecondsT1 > totalSecondsT2) {
                    tempReturn = 1;
                } else if (totalSecondsT1 < totalSecondsT2) {
                    tempReturn = -1;
                } else if (totalSecondsT1 == totalSecondsT2) {
                    tempReturn = 0;
                }

                return tempReturn;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isSuspended() {
        return suspends;
    }

    public static void setSuspend(boolean suspend) {
        suspends = suspend;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        if (!isSuspended()) {
            if (hours >= 0) {
                this.hours = hours;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (!isSuspended()) {
            if (minutes >= 0 && minutes < 60) {
                this.minutes = minutes;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (!isSuspended()) {
            if (seconds >= 0 && seconds <= 60) {
                this.seconds = seconds;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object other) {
        if (!isSuspended()) {
            if (other != null && other instanceof CountDownTimer) {
                CountDownTimer temp = (CountDownTimer)other;
                return this.hours == temp.hours && this.minutes == temp.minutes && this.seconds == temp.seconds;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int compareTo(CountDownTimer other) {
        if (!isSuspended()) {
            if (other != null) {
                int totalSeconds1 = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds();
                int totalSeconds2 = other.getHours() * 3600 + other.getMinutes() * 60 + other.getSeconds();
                return Integer.compare(totalSeconds1, totalSeconds2);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void dec() {
        if (!isSuspended()) {
            if (this.minutes == 0) {
                --this.hours;
                this.minutes = 59;
                this.seconds = 59;
            }

            if (this.seconds == 0) {
                --this.minutes;
                this.seconds = 59;
            } else {
                --this.seconds;
            }

        } else {
            throw new IllegalArgumentException();
        }
    }

    public void sub(int seconds) {
        int totalSeconds;
        if (!isSuspended()) {
            if (seconds <= 0) {
                throw new IllegalArgumentException();
            } else {
                totalSeconds = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds() - seconds;
                if (totalSeconds > 0) {
                    int h = totalSeconds / 60;
                    int m = h % 60;
                    int s = totalSeconds % 60;
                    h /= 60;
                    this.setHours(h);
                    this.setMinutes(m);
                    this.setSeconds(s);
                }

            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void sub(CountDownTimer other) {
        if (!isSuspended()) {
            if (other != null) {
                int totalSeconds = other.hours * 3600 + other.minutes * 60 + other.seconds;
                this.sub(totalSeconds);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void inc() {
        if (!isSuspended()) {
            ++this.seconds;
            if (this.seconds == 60) {
                ++this.minutes;
                this.seconds = 0;
            }

            if (this.minutes == 60) {
                ++this.hours;
                this.minutes = 0;
                this.seconds = 0;
            }

        } else {
            throw new IllegalArgumentException();
        }
    }

    public void add(int seconds) {
        if (!isSuspended()) {
            if (seconds == 0) {
                throw new IllegalArgumentException();
            } else if (seconds < 0) {
                throw new IllegalArgumentException();
            } else {
                int second = this.hours * 3600 + this.minutes * 60 + this.seconds + seconds;
                this.hours = second / 3600;
                this.minutes = second % 3600 / 60;
                this.seconds = seconds % 60;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void add(CountDownTimer other) {
        if (!isSuspended()) {
            if (other != null) {
                int totalSeconds = other.hours * 3600 + other.minutes * 60 + other.seconds + this.seconds;
                this.add(totalSeconds);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String toString() {
        if (!isSuspended()) {
            String tempString = this.hours + ":";
            if (this.minutes < 10) {
                tempString = tempString + "0" + this.minutes;
            } else {
                tempString = tempString + this.minutes;
            }

            if (this.seconds < 10) {
                tempString = tempString + ":0" + this.seconds;
            } else {
                tempString = tempString + ":" + this.seconds;
            }

            return tempString;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void save(String fileName) {
        if (!isSuspended()) {
            PrintWriter out = null;

            try {
                out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            } catch (Exception var4) {
                throw new IllegalArgumentException();
            }

            out.println(this.hours);
            out.println(this.minutes);
            out.println(this.seconds);
            out.close();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void load(String fileName) {
        if (!isSuspended()) {
            try {
                Scanner fileReader = new Scanner(new File(fileName));
                int hours = fileReader.nextInt();
                System.out.println(hours);
                int minutes = fileReader.nextInt();
                System.out.println(minutes);
                int seconds = fileReader.nextInt();
                System.out.println(seconds);
                this.setHours(hours);
                this.setMinutes(minutes);
                this.setSeconds(seconds);
                if (hours < 0 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception var7) {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
