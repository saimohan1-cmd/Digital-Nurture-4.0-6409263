import UserPage from './UserPage'
import GuestPage from './GuestPage'

export default function Greeting({isLoggedIn}) {
  return (
    <div>
      {isLoggedIn?<UserPage></UserPage> : <GuestPage></GuestPage>}
    </div>
  )
}
