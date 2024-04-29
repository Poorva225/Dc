def ring_election(pid, n, failed_pid=None):
    if pid == failed_pid:
        print(f"Process {pid} has failed")
        return
    next_pid = (pid + 1) % n
    print(f"Process {pid} sends message to {next_pid}")

    print(f"Process {pid} starts election")
    ring_election((pid + 1) % n, n, failed_pid)

    if failed_pid is not None and failed_pid != -1:
        new_leader_pid = (failed_pid + 1) % n
        print(f"Process {new_leader_pid} is now elected as leader")


if __name__ == "__main__":
    n = int(input("Enter the number of processes: "))
    failed_pid = int(input("Enter the PID of the failed process (-1 if none): "))

    for pid in range(n):
        ring_election(pid, n, failed_pid)
